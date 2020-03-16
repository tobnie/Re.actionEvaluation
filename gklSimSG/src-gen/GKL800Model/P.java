/**
 */
package GKL800Model;

import reactionContainer.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GKL800Model.P#getP_a_T_x <em>PaTx</em>}</li>
 *   <li>{@link GKL800Model.P#getP_a_T_y <em>PaTy</em>}</li>
 * </ul>
 *
 * @see GKL800Model.GKL800ModelPackage#getP()
 * @model
 * @generated
 */
public interface P extends Agent {
	/**
	 * Returns the value of the '<em><b>PaTx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PaTx</em>' reference.
	 * @see #setP_a_T_x(T)
	 * @see GKL800Model.GKL800ModelPackage#getP_P_a_T_x()
	 * @model
	 * @generated
	 */
	T getP_a_T_x();

	/**
	 * Sets the value of the '{@link GKL800Model.P#getP_a_T_x <em>PaTx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PaTx</em>' reference.
	 * @see #getP_a_T_x()
	 * @generated
	 */
	void setP_a_T_x(T value);

	/**
	 * Returns the value of the '<em><b>PaTy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PaTy</em>' reference.
	 * @see #setP_a_T_y(T)
	 * @see GKL800Model.GKL800ModelPackage#getP_P_a_T_y()
	 * @model
	 * @generated
	 */
	T getP_a_T_y();

	/**
	 * Sets the value of the '{@link GKL800Model.P#getP_a_T_y <em>PaTy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PaTy</em>' reference.
	 * @see #getP_a_T_y()
	 * @generated
	 */
	void setP_a_T_y(T value);

} // P
