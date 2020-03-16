/**
 */
package AlzheimerModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.E1#getE1_x_unb <em>E1 xunb</em>}</li>
 *   <li>{@link AlzheimerModel.E1#getE1_x_ubi <em>E1 xubi</em>}</li>
 * </ul>
 *
 * @see AlzheimerModel.AlzheimerModelPackage#getE1()
 * @model
 * @generated
 */
public interface E1 extends Agent {
	/**
	 * Returns the value of the '<em><b>E1 xunb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E1 xunb</em>' reference.
	 * @see #setE1_x_unb(UNB_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getE1_E1_x_unb()
	 * @model
	 * @generated
	 */
	UNB_s getE1_x_unb();

	/**
	 * Sets the value of the '{@link AlzheimerModel.E1#getE1_x_unb <em>E1 xunb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E1 xunb</em>' reference.
	 * @see #getE1_x_unb()
	 * @generated
	 */
	void setE1_x_unb(UNB_s value);

	/**
	 * Returns the value of the '<em><b>E1 xubi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E1 xubi</em>' reference.
	 * @see #setE1_x_ubi(UBI_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getE1_E1_x_ubi()
	 * @model
	 * @generated
	 */
	UBI_s getE1_x_ubi();

	/**
	 * Sets the value of the '{@link AlzheimerModel.E1#getE1_x_ubi <em>E1 xubi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E1 xubi</em>' reference.
	 * @see #getE1_x_ubi()
	 * @generated
	 */
	void setE1_x_ubi(UBI_s value);

} // E1
