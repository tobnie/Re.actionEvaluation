/**
 */
package AlzheimerModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.MT#getMT_l_Tau_phos <em>MT lTau phos</em>}</li>
 * </ul>
 *
 * @see AlzheimerModel.AlzheimerModelPackage#getMT()
 * @model
 * @generated
 */
public interface MT extends Agent {
	/**
	 * Returns the value of the '<em><b>MT lTau phos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MT lTau phos</em>' reference.
	 * @see #setMT_l_Tau_phos(Tau)
	 * @see AlzheimerModel.AlzheimerModelPackage#getMT_MT_l_Tau_phos()
	 * @model
	 * @generated
	 */
	Tau getMT_l_Tau_phos();

	/**
	 * Sets the value of the '{@link AlzheimerModel.MT#getMT_l_Tau_phos <em>MT lTau phos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MT lTau phos</em>' reference.
	 * @see #getMT_l_Tau_phos()
	 * @generated
	 */
	void setMT_l_Tau_phos(Tau value);

} // MT
