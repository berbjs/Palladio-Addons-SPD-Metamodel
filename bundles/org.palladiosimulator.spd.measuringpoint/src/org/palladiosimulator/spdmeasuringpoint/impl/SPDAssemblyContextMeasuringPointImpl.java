/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcmmeasuringpoint.AssemblyReference;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;
import org.palladiosimulator.spdmeasuringpoint.SPDAssemblyContextMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPD Assembly Context Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.SPDAssemblyContextMeasuringPointImpl#getAssembly <em>Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDAssemblyContextMeasuringPointImpl extends MeasuringPointImpl
		implements SPDAssemblyContextMeasuringPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPDAssemblyContextMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdmeasuringpointPackage.Literals.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssembly() {
		return (AssemblyContext) eDynamicGet(SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY,
				PcmmeasuringpointPackage.Literals.ASSEMBLY_REFERENCE__ASSEMBLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssembly() {
		return (AssemblyContext) eDynamicGet(SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY,
				PcmmeasuringpointPackage.Literals.ASSEMBLY_REFERENCE__ASSEMBLY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssembly(final AssemblyContext newAssembly) {
		eDynamicSet(SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY,
				PcmmeasuringpointPackage.Literals.ASSEMBLY_REFERENCE__ASSEMBLY, newAssembly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY:
			if (resolve)
				return getAssembly();
			return basicGetAssembly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY:
			setAssembly((AssemblyContext) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY:
			setAssembly((AssemblyContext) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY:
			return basicGetAssembly() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
		if (baseClass == AssemblyReference.class) {
			switch (derivedFeatureID) {
			case SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY:
				return PcmmeasuringpointPackage.ASSEMBLY_REFERENCE__ASSEMBLY;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == AssemblyReference.class) {
			switch (baseFeatureID) {
			case PcmmeasuringpointPackage.ASSEMBLY_REFERENCE__ASSEMBLY:
				return SpdmeasuringpointPackage.SPD_ASSEMBLY_CONTEXT_MEASURING_POINT__ASSEMBLY;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getStringRepresentation() {
		if (this.getAssembly() == null) {
			return "";
		}

		if (this.getAssembly().getEntityName() == null) {
			return super.getStringRepresentation();
		}

		EcoreUtil.resolveAll(this);

		final StringBuilder result = new StringBuilder();

		result.append("Assembly Context ");
		result.append(this.getAssembly().getEntityName());
		result.append(" [");
		result.append(this.getAssembly().getId());
		result.append("]");

		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getResourceURIRepresentation() {
		if (this.getAssembly() == null) {
			return "";
		}
		EcoreUtil.resolveAll(this);
		return EMFLoadHelper.getResourceURI(this.getAssembly());
	}

} //SPDAssemblyContextMeasuringPointImpl
