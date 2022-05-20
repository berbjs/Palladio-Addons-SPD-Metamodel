/**
 */
package de.unistuttgart.slingshot.spd.impl;

import de.unistuttgart.slingshot.spd.SPD;
import de.unistuttgart.slingshot.spd.ScalingPolicy;
import de.unistuttgart.slingshot.spd.SpdPackage;

import de.unistuttgart.slingshot.spd.targets.TargetGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.impl.SPDImpl#getScalingPolicies <em>Scaling Policies</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.impl.SPDImpl#getTargetGroups <em>Target Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDImpl extends NamedElementImpl implements SPD {
	/**
	 * The cached value of the '{@link #getScalingPolicies() <em>Scaling Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalingPolicy> scalingPolicies;

	/**
	 * The cached value of the '{@link #getTargetGroups() <em>Target Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetGroup> targetGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalingPolicy> getScalingPolicies() {
		if (scalingPolicies == null) {
			scalingPolicies = new EObjectContainmentEList<ScalingPolicy>(ScalingPolicy.class, this, SpdPackage.SPD__SCALING_POLICIES);
		}
		return scalingPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetGroup> getTargetGroups() {
		if (targetGroups == null) {
			targetGroups = new EObjectContainmentEList<TargetGroup>(TargetGroup.class, this, SpdPackage.SPD__TARGET_GROUPS);
		}
		return targetGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpdPackage.SPD__SCALING_POLICIES:
				return ((InternalEList<?>)getScalingPolicies()).basicRemove(otherEnd, msgs);
			case SpdPackage.SPD__TARGET_GROUPS:
				return ((InternalEList<?>)getTargetGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpdPackage.SPD__SCALING_POLICIES:
				return getScalingPolicies();
			case SpdPackage.SPD__TARGET_GROUPS:
				return getTargetGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpdPackage.SPD__SCALING_POLICIES:
				getScalingPolicies().clear();
				getScalingPolicies().addAll((Collection<? extends ScalingPolicy>)newValue);
				return;
			case SpdPackage.SPD__TARGET_GROUPS:
				getTargetGroups().clear();
				getTargetGroups().addAll((Collection<? extends TargetGroup>)newValue);
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
			case SpdPackage.SPD__SCALING_POLICIES:
				getScalingPolicies().clear();
				return;
			case SpdPackage.SPD__TARGET_GROUPS:
				getTargetGroups().clear();
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
			case SpdPackage.SPD__SCALING_POLICIES:
				return scalingPolicies != null && !scalingPolicies.isEmpty();
			case SpdPackage.SPD__TARGET_GROUPS:
				return targetGroups != null && !targetGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SPDImpl
