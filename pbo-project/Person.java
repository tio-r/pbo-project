// Person.java (abstract class)
public abstract class Person {
    protected String id;
    protected String nama;

    public Person(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public abstract void tampilkanInfo();
}