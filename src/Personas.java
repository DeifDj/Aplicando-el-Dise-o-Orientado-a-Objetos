public abstract class  Personas {
    private String id;

    private String name;

    public Personas(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
