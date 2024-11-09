package OOP.Library;

public class Employes {
    private long id;
    private String name,lastName,positions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }


    public static void main(String[] args) {
        Employes[] employ=new Employes[10];

        for (int i = 0;i<10;i++){
            employ[i]=new Employes();
            employ[i].setId(i+500);
        }
        System.out.println(employ[3].getId());
    }
}
