/**
 */
package spd.adjustmenttype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spd.adjustmenttype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjustmenttypeFactoryImpl extends EFactoryImpl implements AdjustmenttypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdjustmenttypeFactory init() {
		try {
			AdjustmenttypeFactory theAdjustmenttypeFactory = (AdjustmenttypeFactory)EPackage.Registry.INSTANCE.getEFactory(AdjustmenttypePackage.eNS_URI);
			if (theAdjustmenttypeFactory != null) {
				return theAdjustmenttypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdjustmenttypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmenttypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdjustmenttypePackage.RELATIVE_ADJUSTMENT: return createRelativeAdjustment();
			case AdjustmenttypePackage.ABSOLUTE_ADJUSTMENT: return createAbsoluteAdjustment();
			case AdjustmenttypePackage.STEP_ADJUSTMENT: return createStepAdjustment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeAdjustment createRelativeAdjustment() {
		RelativeAdjustmentImpl relativeAdjustment = new RelativeAdjustmentImpl();
		return relativeAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsoluteAdjustment createAbsoluteAdjustment() {
		AbsoluteAdjustmentImpl absoluteAdjustment = new AbsoluteAdjustmentImpl();
		return absoluteAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepAdjustment createStepAdjustment() {
		StepAdjustmentImpl stepAdjustment = new StepAdjustmentImpl();
		return stepAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmenttypePackage getAdjustmenttypePackage() {
		return (AdjustmenttypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdjustmenttypePackage getPackage() {
		return AdjustmenttypePackage.eINSTANCE;
	}

} //AdjustmenttypeFactoryImpl
