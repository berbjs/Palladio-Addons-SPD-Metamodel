/**
 */
package spd.adjustmenttype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spd.adjustmenttype.AdjustmenttypePackage
 * @generated
 */
public interface AdjustmenttypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdjustmenttypeFactory eINSTANCE = spd.adjustmenttype.impl.AdjustmenttypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relative Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Adjustment</em>'.
	 * @generated
	 */
	RelativeAdjustment createRelativeAdjustment();

	/**
	 * Returns a new object of class '<em>Absolute Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Adjustment</em>'.
	 * @generated
	 */
	AbsoluteAdjustment createAbsoluteAdjustment();

	/**
	 * Returns a new object of class '<em>Step Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Adjustment</em>'.
	 * @generated
	 */
	StepAdjustment createStepAdjustment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdjustmenttypePackage getAdjustmenttypePackage();

} //AdjustmenttypeFactory
