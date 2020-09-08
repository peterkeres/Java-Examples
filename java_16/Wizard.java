

/**
 * Wizard class
 */
public class Wizard extends Character
{
    //Instance variables
    String spell;
    int spellDamage;

    /**
     * Default constrocter for a wizard
     * @param name name of wizard
     * @param hitPoints total hitpoints of wizard
     * @param spell spell wizard uses
     * @param spellDamage damage the spell does
     */
    public Wizard(String name, int hitPoints, String spell, int spellDamage){
        super(name, hitPoints);
        this.spell = spell;
        this.spellDamage = spellDamage;
    }

    /**
     *
     * @return The name of the spell
     */
    public String getSpell() {
        return spell;
    }

    /**
     *
     * @return the Damage the spell does
     */
    public int getSpellDamage() {
        return spellDamage;
    }


    @Override
    public String toString() {
        return "Wizard{" +
                "spell='" + getSpell() + '\'' +
                ", spellDamage=" + getSpellDamage() +
                ", name='" + super.getName() + '\'' +
                ", hitPoints=" + super.getHitPoints() +
                '}';
    }
}
