/**
 */
package AlzheimerModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.Tau#getTau_phos_u <em>Tau phos u</em>}</li>
 *   <li>{@link AlzheimerModel.Tau#getTau_phos_p1 <em>Tau phos p1</em>}</li>
 *   <li>{@link AlzheimerModel.Tau#getTau_phos_p2 <em>Tau phos p2</em>}</li>
 * </ul>
 *
 * @see AlzheimerModel.AlzheimerModelPackage#getTau()
 * @model
 * @generated
 */
public interface Tau extends Agent {
	/**
	 * Returns the value of the '<em><b>Tau phos u</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tau phos u</em>' reference.
	 * @see #setTau_phos_u(U_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getTau_Tau_phos_u()
	 * @model
	 * @generated
	 */
	U_s getTau_phos_u();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Tau#getTau_phos_u <em>Tau phos u</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau phos u</em>' reference.
	 * @see #getTau_phos_u()
	 * @generated
	 */
	void setTau_phos_u(U_s value);

	/**
	 * Returns the value of the '<em><b>Tau phos p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tau phos p1</em>' reference.
	 * @see #setTau_phos_p1(P1_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getTau_Tau_phos_p1()
	 * @model
	 * @generated
	 */
	P1_s getTau_phos_p1();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Tau#getTau_phos_p1 <em>Tau phos p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau phos p1</em>' reference.
	 * @see #getTau_phos_p1()
	 * @generated
	 */
	void setTau_phos_p1(P1_s value);

	/**
	 * Returns the value of the '<em><b>Tau phos p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tau phos p2</em>' reference.
	 * @see #setTau_phos_p2(P2_s)
	 * @see AlzheimerModel.AlzheimerModelPackage#getTau_Tau_phos_p2()
	 * @model
	 * @generated
	 */
	P2_s getTau_phos_p2();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Tau#getTau_phos_p2 <em>Tau phos p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau phos p2</em>' reference.
	 * @see #getTau_phos_p2()
	 * @generated
	 */
	void setTau_phos_p2(P2_s value);

} // Tau
