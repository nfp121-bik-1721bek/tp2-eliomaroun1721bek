package question1;

import static org.junit.Assert.assertTrue;

/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author (votre nom)
 * @version (un num � ro de version ou une date)
 * <p>
 * Les classes-test sont document�es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont bas�es sur le document � 2002 Robert A. Ballance intitul�
 * �JUnit: Unit Testing Framework�.
 * <p>
 * Les objets Test (et TestSuite) sont associ�s aux classes � tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe
 * Name.java se nommera NameTest.java); les deux se retrouvent dans le
 * m�me paquetage. Les "engagements" (anglais : "fixture") forment un
 * ensemble de conditions qui sont vraies pour chaque m�thode Test �
 * ex�cuter. Il peut y avoir plus d'une m�thode Test dans une classe
 * Test; leur ensemble forme un objet TestSuite. BlueJ d�couvrira
 * automatiquement (par introspection) les m�thodes Test de votre
 * classe Test et g�n�rera la TestSuite cons�quente. Chaque appel d'une
 * m�thode Test sera pr�c�d� d'un appel de setUp(), qui r�alise les
 * engagements, et suivi d'un appel � tearDown(), qui les d�truit.
 */
public class FahrenheitCelsiusTest extends junit.framework.TestCase {
    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    // Vous pouvez �galement les saisir automatiquement du pr�sentoir
    // � l'aide du menu contextuel "Pr�sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pr�sentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        test_fahrenheitEnCelsius();
    }

    /**
     * Supprime les engagements
     * <p>
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Lib�rez ici les ressources engag�es par setUp()
    }

    /**
     * Il ne vous reste plus qu'� d�finir une ou plusieurs m�thodes de test. Ces
     * m�thodes doivent v�rifier les r�sultats attendus � l'aide d'assertions
     * assertTrue(<boolean>). Par convention, leurs noms devraient d�buter par
     * "test". Vous pouvez �baucher le corps gr�ce au menu contextuel
     * "Enregistrer une m�thode de test".
     */
    public void test3(){
        assertEquals("    150 �F -> 65.6 �C ? ", 65.6, question1.FahrenheitCelsius.fahrenheitEnCelsius(150), 0.1);
        assertEquals("   54 �F -> 12.2 �C ?", 12.2, question1.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);

    }
    public void test_fahrenheitEnCelsius() {
        assertEquals("    0 �F -> -17.7 �C ? ", -17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("  100 �F -> 37.7 �C ? ", 37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals(" 2000 �F -> 1093.3 �C ?", 1093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals("   54 �F -> 12.2 �C ?", 12.2, question1.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);

    }
    public void test2(){
        assertEquals("    10 �F -> -20 �C ? ", -20, question1.FahrenheitCelsius.fahrenheitEnCelsius(10), 0.1);
        assertEquals("  600 �F -> 67.8 �C ? ",67.8, question1.FahrenheitCelsius.fahrenheitEnCelsius(600), 0.1);

    }

    

}
