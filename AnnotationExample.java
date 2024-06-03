import java.lang.annotation.*;
import java.lang.reflect.*;
import javax.xml.bind.*;

// Definizione dell'annotazione Info
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Info {
    String author();
    String version();
}

// Definizione dell'annotazione DeprecatedCustom
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DeprecatedCustom {
}

// Classe Person annotata con @Info
@Info(author = "John Doe", version = "1.0")
class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @DeprecatedCustom
    public int getAge() {
        return age;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }

    // Metodi getter e setter necessari per la serializzazione XML
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        // Creazione di un oggetto Person
        Person person = new Person("Alice", 30);

        // Riflettiamo sulla presenza delle annotazioni nella classe Person
        Class<?> personClass = person.getClass();

        // Verifica se la classe è annotata con @Info
        if (personClass.isAnnotationPresent(Info.class)) {
            Info info = personClass.getAnnotation(Info.class);
            System.out.println("Classe Person annotata con: @Info(author=" + info.author() + ", version=" + info.version() + ")");
        }

        // Verifica le annotazioni sui metodi della classe Person
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(DeprecatedCustom.class)) {
                System.out.println("Metodo " + method.getName() + " annotato con: @DeprecatedCustom");
            } else {
                System.out.println("Metodo " + method.getName() + " annotato con: null");
            }
        }

        // Serializzazione dell'oggetto Person in XML
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Stampa su console l'XML
        marshaller.marshal(person, System.out);

        // Salva l'XML in un file
        marshaller.marshal(person, new java.io.File("person.xml"));

        // Lettura dell'oggetto Person dall'XML
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Person personFromXML = (Person) unmarshaller.unmarshal(new java.io.File("person.xml"));

        // Stampa dell'oggetto deserializzato
        System.out.println("Deserialized Person: " + personFromXML.getInfo());
    }
}
