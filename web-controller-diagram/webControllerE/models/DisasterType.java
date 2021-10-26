/**
 */
package webControllerE.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Disaster Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webControllerE.models.modelsPackage#getDisasterType()
 * @model
 * @generated
 */
public enum DisasterType implements Enumerator {
	/**
	 * The '<em><b>CYCLONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLONE_VALUE
	 * @generated
	 * @ordered
	 */
	CYCLONE(0, "CYCLONE", "CYCLONE"),

	/**
	 * The '<em><b>FLOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOD_VALUE
	 * @generated
	 * @ordered
	 */
	FLOOD(1, "FLOOD", "FLOOD"),

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
	 * The '<em><b>WILDFIRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WILDFIRE_VALUE
	 * @generated
	 * @ordered
	 */
	WILDFIRE(3, "WILDFIRE", "WILDFIRE"),

	/**
	 * The '<em><b>NO DISASTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DISASTER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DISASTER(4, "NO_DISASTER", "NO_DISASTER");

	/**
	 * The '<em><b>CYCLONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CYCLONE_VALUE = 0;

	/**
	 * The '<em><b>FLOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOOD_VALUE = 1;

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
	 * The '<em><b>WILDFIRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WILDFIRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WILDFIRE_VALUE = 3;

	/**
	 * The '<em><b>NO DISASTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DISASTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_DISASTER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Disaster Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisasterType[] VALUES_ARRAY = new DisasterType[] { CYCLONE, FLOOD, EARTHQUAKE, WILDFIRE,
			NO_DISASTER, };

	/**
	 * A public read-only list of all the '<em><b>Disaster Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisasterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Disaster Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisasterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisasterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Disaster Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisasterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisasterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Disaster Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisasterType get(int value) {
		switch (value) {
		case CYCLONE_VALUE:
			return CYCLONE;
		case FLOOD_VALUE:
			return FLOOD;
		case EARTHQUAKE_VALUE:
			return EARTHQUAKE;
		case WILDFIRE_VALUE:
			return WILDFIRE;
		case NO_DISASTER_VALUE:
			return NO_DISASTER;
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
	private DisasterType(int value, String name, String literal) {
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

} //DisasterType
