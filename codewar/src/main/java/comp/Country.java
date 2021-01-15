package comp;

public class Country implements Comparable {
    private int id;
    private String name;

    public Country(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Strign getName() {
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

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
