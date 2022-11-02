package ie.atu;

public class Passenger {
    private static String Name = "Aidan", Title = "Mr", Id, Phone;
    private static int Age;
    private static int LegalLimit = 16;



    public Passenger(String title, String name, String id, String phone, int age) {
        Title = title;
        Name = name;
        Id = id;
        Phone = phone;
        Age = age;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        if(name.length() >= 3) {
            Name = name;
        }
        else {
            throw new IllegalArgumentException("Name must be greater than 3 characters");
        }

    }

    public static String getTitle() {
        return Title;
    }

    public static void setTitle(String title) {
        if(title.equals("Mr") || title.equals("Ms") || title.equals("Mrs"))
        {
            Title = title;
        }
        else {
            throw new IllegalArgumentException("Title must be either Mr, Ms or Mrs");
        }

    }

    public static String getId() {
        return Id;
    }

    public static void setId(String id) {
        if(id.length() >= 10)
        {
            Id = id;
        }
        else {
            throw new IllegalArgumentException("Id must be greater than 10 characters");
        }
    }

    public static String getPhone() {
        return Phone;
    }

    public static void setPhone(String phone) {
        if(phone.length() >= 10)
        {
            Phone = phone;
        }
        else {
            throw new IllegalArgumentException("Phone must be greater than 7 characters");
        }
    }

    public static int getAge() {
        return Age;
    }

    public static void setAge(int age) {
        if(age >= LegalLimit) {
            Age = age;
        }
        else {
            throw new IllegalArgumentException("Age must be greater than 16");
        }

    }
}



