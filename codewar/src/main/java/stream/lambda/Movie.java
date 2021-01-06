package stream.lambda;

public class Movie {
    private String id;
    private  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Movie(String id , String name){
        super();
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
