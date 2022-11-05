package ie.atu;

public class Passenger {
    static String Name, Title, Id, Phone;
    static int Age;
    static int LegalLimit = 16;


    public Passenger(String title, String name, String id, String phone, int age){
        this.Title = title;
        this.Name  = name;
        this.Id = id;
        this.Phone = phone;
        this.Age = age;
    }

    public void Passenger(String title, String name, String id, String phone, int age) {

        if(title.equals("Mr") || title.equals("Ms") || title.equals("Mrs"))
        {
            Title = title;
        }
        else {
            throw new IllegalArgumentException("Title must be either Mr, Ms or Mrs");
        }

        if(name.length() >= 3) {
            Name = name;
        }
        else {
            throw new IllegalArgumentException("Name must be greater than 3 characters");
        }

        if(id.length() >= 10)
        {
            Id = id;
        }
        else {
            throw new IllegalArgumentException("Id must be greater than 10 characters");
        }

        if(phone.length() >= 10)
        {
            Phone = phone;
        }
        else {
            throw new IllegalArgumentException("Phone must be greater than 7 characters");
        }

        // test coverage is saying this isnt covered.
        if(age >= LegalLimit)
        {
            Age = age;
        }
        else {
            throw new IllegalArgumentException("Age must be greater than 16");
        }
    }

    public static String getName() {
        return Name;
    }

    public static String getTitle() {
        return Title;
    }

    public static String getId() {
        return Id;
    }

    public static String getPhone() {
        return Phone;
    }

    public int getAge() {
        return Age;
    }
}



