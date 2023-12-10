package MyPackage;

import jakarta.persistence.*;

@Entity
@Table(name = "cat")
public class Cat_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column
    private  int id;

    @Column
    private String name;


    //сеттеры\геттеры\конструктуор
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat_Entity() {
    }

    public Cat_Entity(String name) {
        this.name = name;
    }
}
