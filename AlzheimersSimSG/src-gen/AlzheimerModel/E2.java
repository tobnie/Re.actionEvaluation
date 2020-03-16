/**
 */
package AlzheimerModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.E2#getE2_x_unb <em>E2 xunb</em>}</li>
 *   <li>{@link AlzheimerModel.E2#getE2_x_ubi <em>E2 xubi</em>}</li>
 * </ul>
 *
 * @see AlzheimerModel.AlzheimerModelPackage#getE2()
 * @model
 * @generated
 */
public interface E2 extends Agent {
	/**
	 * Returns the value of the '<em><b>E2 xunb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E2 xunb</em>' reference.
	 * @see #setE2_x_unb(UNB_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getE2_E2_x_unb()
	 * @model
	 * @generated
	 */
	UNB_s getE2_x_unb();

	/**
	 * Sets the value of the '{@link AlzheimerModel.E2#getE2_x_unb <em>E2 xunb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E2 xunb</em>' reference.
	 * @see #getE2_x_unb()
	 * @generated
	 */
	void setE2_x_unb(UNB_s value);

	/**
	 * Returns the value of the '<em><b>E2 xubi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E2 xubi</em>' reference.
	 * @see #setE2_x_ubi(UBI_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getE2_E2_x_ubi()
	 * @model
	 * @generated
	 */
	UBI_s getE2_x_ubi();

	/**
	 * Sets the value of the '{@link AlzheimerModel.E2#getE2_x_ubi <em>E2 xubi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E2 xubi</em>' reference.
	 * @see #getE2_x_ubi()
	 * @generated
	 */
	void setE2_x_ubi(UBI_s value);

} // E2
