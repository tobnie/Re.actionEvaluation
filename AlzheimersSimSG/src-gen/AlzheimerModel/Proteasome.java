/**
 */
package AlzheimerModel;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proteasome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AlzheimerModel.Proteasome#getProteasome_x_Tau_phos <em>Proteasome xTau phos</em>}</li>
 *   <li>{@link AlzheimerModel.Proteasome#getProteasome_x_AggTau_y <em>Proteasome xAgg Tau y</em>}</li>
 *   <li>{@link AlzheimerModel.Proteasome#getProteasome_x_AggAbeta_y <em>Proteasome xAgg Abeta y</em>}</li>
 *   <li>{@link AlzheimerModel.Proteasome#getProteasome_x_Mdm2_ubi <em>Proteasome xMdm2 ubi</em>}</li>
 * </ul>
 *
 * @see AlzheimerModel.AlzheimerModelPackage#getProteasome()
 * @model
 * @generated
 */
public interface Proteasome extends Agent {
	/**
	 * Returns the value of the '<em><b>Proteasome xTau phos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proteasome xTau phos</em>' reference.
	 * @see #setProteasome_x_Tau_phos(Tau)
	 * @see AlzheimerModel.AlzheimerModelPackage#getProteasome_Proteasome_x_Tau_phos()
	 * @model
	 * @generated
	 */
	Tau getProteasome_x_Tau_phos();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Proteasome#getProteasome_x_Tau_phos <em>Proteasome xTau phos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proteasome xTau phos</em>' reference.
	 * @see #getProteasome_x_Tau_phos()
	 * @generated
	 */
	void setProteasome_x_Tau_phos(Tau value);

	/**
	 * Returns the value of the '<em><b>Proteasome xAgg Tau y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proteasome xAgg Tau y</em>' reference.
	 * @see #setProteasome_x_AggTau_y(AggTau)
	 * @see AlzheimerModel.AlzheimerModelPackage#getProteasome_Proteasome_x_AggTau_y()
	 * @model
	 * @generated
	 */
	AggTau getProteasome_x_AggTau_y();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Proteasome#getProteasome_x_AggTau_y <em>Proteasome xAgg Tau y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proteasome xAgg Tau y</em>' reference.
	 * @see #getProteasome_x_AggTau_y()
	 * @generated
	 */
	void setProteasome_x_AggTau_y(AggTau value);

	/**
	 * Returns the value of the '<em><b>Proteasome xAgg Abeta y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proteasome xAgg Abeta y</em>' reference.
	 * @see #setProteasome_x_AggAbeta_y(AggAbeta)
	 * @see AlzheimerModel.AlzheimerModelPackage#getProteasome_Proteasome_x_AggAbeta_y()
	 * @model
	 * @generated
	 */
	AggAbeta getProteasome_x_AggAbeta_y();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Proteasome#getProteasome_x_AggAbeta_y <em>Proteasome xAgg Abeta y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proteasome xAgg Abeta y</em>' reference.
	 * @see #getProteasome_x_AggAbeta_y()
	 * @generated
	 */
	void setProteasome_x_AggAbeta_y(AggAbeta value);

	/**
	 * Returns the value of the '<em><b>Proteasome xMdm2 ubi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proteasome xMdm2 ubi</em>' reference.
	 * @see #setProteasome_x_Mdm2_ubi(Mdm2)
	 * @see AlzheimerModel.AlzheimerModelPackage#getProteasome_Proteasome_x_Mdm2_ubi()
	 * @model
	 * @generated
	 */
	Mdm2 getProteasome_x_Mdm2_ubi();

	/**
	 * Sets the value of the '{@link AlzheimerModel.Proteasome#getProteasome_x_Mdm2_ubi <em>Proteasome xMdm2 ubi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proteasome xMdm2 ubi</em>' reference.
	 * @see #getProteasome_x_Mdm2_ubi()
	 * @generated
	 */
	void setProteasome_x_Mdm2_ubi(Mdm2 value);

} // Proteasome
