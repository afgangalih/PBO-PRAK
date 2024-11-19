package soal_1;

// DamageableObject.java
public abstract class DamageableObject extends GameObject {
    public int MaxHealth;
    private int Health;

    public boolean IsDead() {
        return Health <= 0;
    }

    public void TakeDamage(int damage) {
        Health -= damage;
        System.out.println(name + " took " + damage + " damage. Health now: " + Health);
        if (IsDead()) {
            OnKilled();
        }
    }

    // Abstract method for handling the object's death
    public abstract void OnKilled();

    // Getter and setter for Health
    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= MaxHealth) {
            this.Health = health;
        } else {
            System.out.println("Invalid health value.");
        }
    }
}

