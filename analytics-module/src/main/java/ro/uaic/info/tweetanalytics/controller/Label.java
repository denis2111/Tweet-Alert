/**
 */
package controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Label</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see controller.ControllerPackage#getLabel()
 * @model
 * @generated
 */
public enum Label implements Enumerator {
	/**
	 * The '<em><b>NONDISASTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONDISASTER_VALUE
	 * @generated
	 * @ordered
	 */
	NONDISASTER(0, "NONDISASTER", "NONDISASTER"),

	/**
	 * The '<em><b>CYCLONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLONE_VALUE
	 * @generated
	 * @ordered
	 */
	CYCLONE(1, "CYCLONE", "CYCLONE"),

	/**
	 * The '<em><b>EARTHQUAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHQUAKE_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHQUAKE(2, "EARTHQUAKE", "EARTHQUAKE"),

	/**
	 * The '<em><b>FLOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOD_VALUE
	 * @generated
	 * @ordered
	 */
	FLOOD(3, "FLOOD", "FLOOD"),

	/**
	 * The '<em><b>FIRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRE(4, "FIRE", "FIRE");

	/**
	 * The '<em><b>NONDISASTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONDISASTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONDISASTER_VALUE = 0;

	/**
	 * The '<em><b>CYCLONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CYCLONE_VALUE = 1;

	/**
	 * The '<em><b>EARTHQUAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHQUAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTHQUAKE_VALUE = 2;

	/**
	 * The '<em><b>FLOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOOD_VALUE = 3;

	/**
	 * The '<em><b>FIRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Label[] VALUES_ARRAY =
		new Label[] {
			NONDISASTER,
			CYCLONE,
			EARTHQUAKE,
			FLOOD,
			FIRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Label> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Label get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Label result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Label getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Label result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Label get(int value) {
		switch (value) {
			case NONDISASTER_VALUE: return NONDISASTER;
			case CYCLONE_VALUE: return CYCLONE;
			case EARTHQUAKE_VALUE: return EARTHQUAKE;
			case FLOOD_VALUE: return FLOOD;
			case FIRE_VALUE: return FIRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Label(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Label
