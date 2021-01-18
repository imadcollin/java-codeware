package comp;

public class Country {
     int id;
     String name;

    public Country(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    // @Override
    // public int compareTo(Country country) {
    //     return this.getId().compareTo(country.getId());
    // }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name is : " + name + " and ID is:  " + id;
    }

  

}
