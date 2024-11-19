package soal_1;

public class GameObject {
    public String name;
    public int PosX;
    public int PosY;
    
    public void Despwan() {
        System.out.println(this.name + " despawned");
    }

      // Getters and Setters
      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosX() {
        return PosX;
    }

    public void setPosX(int posX) {
        this.PosX = posX;
    }

    public int getPosY() {
        return PosY;
    }

    public void setPosY(int posY) {
        this.PosY = posY;
    }
}