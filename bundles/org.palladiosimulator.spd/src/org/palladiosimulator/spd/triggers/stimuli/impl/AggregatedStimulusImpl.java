/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.AggregatedStimulusImpl#getAggregationMethod <em>Aggregation Method</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.AggregatedStimulusImpl#getAggregationPeriod <em>Aggregation Period</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.AggregatedStimulusImpl#getAggregatedStimulus <em>Aggregated Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedStimulusImpl extends StimulusImpl implements AggregatedStimulus {
	/**
	 * The default value of the '{@link #getAggregationMethod() <em>Aggregation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final AGGREGATIONMETHOD AGGREGATION_METHOD_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

	/**
	 * The default value of the '{@link #getAggregationPeriod() <em>Aggregation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double AGGREGATION_PERIOD_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StimuliPackage.Literals.AGGREGATED_STIMULUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AGGREGATIONMETHOD getAggregationMethod() {
		return (AGGREGATIONMETHOD) eDynamicGet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD,
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationMethod(AGGREGATIONMETHOD newAggregationMethod) {
		eDynamicSet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD,
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_METHOD, newAggregationMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAggregationPeriod() {
		return (Double) eDynamicGet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD,
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationPeriod(double newAggregationPeriod) {
		eDynamicSet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD,
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATION_PERIOD, newAggregationPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getAggregatedStimulus() {
		return (Stimulus) eDynamicGet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregatedStimulus(Stimulus newAggregatedStimulus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAggregatedStimulus,
				StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregatedStimulus(Stimulus newAggregatedStimulus) {
		eDynamicSet(StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS,
				StimuliPackage.Literals.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS, newAggregatedStimulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
			return basicSetAggregatedStimulus(null, msgs);
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
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
			return getAggregationMethod();
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
			return getAggregationPeriod();
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
			return getAggregatedStimulus();
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
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
			setAggregationMethod((AGGREGATIONMETHOD) newValue);
			return;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
			setAggregationPeriod((Double) newValue);
			return;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
			setAggregatedStimulus((Stimulus) newValue);
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
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
			setAggregationMethod(AGGREGATION_METHOD_EDEFAULT);
			return;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
			setAggregationPeriod(AGGREGATION_PERIOD_EDEFAULT);
			return;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
			setAggregatedStimulus((Stimulus) null);
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
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_METHOD:
			return getAggregationMethod() != AGGREGATION_METHOD_EDEFAULT;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATION_PERIOD:
			return getAggregationPeriod() != AGGREGATION_PERIOD_EDEFAULT;
		case StimuliPackage.AGGREGATED_STIMULUS__AGGREGATED_STIMULUS:
			return getAggregatedStimulus() != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregatedStimulusImpl
