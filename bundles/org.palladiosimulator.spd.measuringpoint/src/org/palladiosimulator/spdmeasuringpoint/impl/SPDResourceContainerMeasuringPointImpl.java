/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;
import org.palladiosimulator.pcmmeasuringpoint.ResourceContainerReference;
import org.palladiosimulator.spdmeasuringpoint.SPDResourceContainerMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPD Resource Container Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.SPDResourceContainerMeasuringPointImpl#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDResourceContainerMeasuringPointImpl extends MeasuringPointImpl
		implements SPDResourceContainerMeasuringPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPDResourceContainerMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdmeasuringpointPackage.Literals.SPD_RESOURCE_CONTAINER_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainer getResourceContainer() {
		return (ResourceContainer) eDynamicGet(
				SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER,
				PcmmeasuringpointPackage.Literals.RESOURCE_CONTAINER_REFERENCE__RESOURCE_CONTAINER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetResourceContainer() {
		return (ResourceContainer) eDynamicGet(
				SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER,
				PcmmeasuringpointPackage.Literals.RESOURCE_CONTAINER_REFERENCE__RESOURCE_CONTAINER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceContainer(ResourceContainer newResourceContainer) {
		eDynamicSet(SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER,
				PcmmeasuringpointPackage.Literals.RESOURCE_CONTAINER_REFERENCE__RESOURCE_CONTAINER,
				newResourceContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER:
			if (resolve)
				return getResourceContainer();
			return basicGetResourceContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER:
			setResourceContainer((ResourceContainer) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER:
			setResourceContainer((ResourceContainer) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER:
			return basicGetResourceContainer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceContainerReference.class) {
			switch (derivedFeatureID) {
			case SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER:
				return PcmmeasuringpointPackage.RESOURCE_CONTAINER_REFERENCE__RESOURCE_CONTAINER;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceContainerReference.class) {
			switch (baseFeatureID) {
			case PcmmeasuringpointPackage.RESOURCE_CONTAINER_REFERENCE__RESOURCE_CONTAINER:
				return SpdmeasuringpointPackage.SPD_RESOURCE_CONTAINER_MEASURING_POINT__RESOURCE_CONTAINER;
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
		if (this.getResourceContainer() == null) {
			return "";
		}

		if (this.getResourceContainer().getEntityName() == null) {
			return super.getStringRepresentation();
		}

		EcoreUtil.resolveAll(this);

		final StringBuilder result = new StringBuilder();

		result.append("Resource Container ");
		result.append(this.getResourceContainer().getEntityName());
		result.append(" [");
		result.append(this.getResourceContainer().getId());
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
		if (this.getResourceContainer() == null) {
			return "";
		}
		EcoreUtil.resolveAll(this);
		return EMFLoadHelper.getResourceURI(this.getResourceContainer());
	}

} //SPDResourceContainerMeasuringPointImpl
