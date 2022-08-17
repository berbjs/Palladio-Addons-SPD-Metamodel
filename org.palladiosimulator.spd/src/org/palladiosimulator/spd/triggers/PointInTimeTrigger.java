/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point In Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PointInTimeTrigger is a trigger that is defined by the time on which a spd.TargetGroup should be adjusted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.PointInTimeTrigger#getPointInTime <em>Point In Time</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getPointInTimeTrigger()
 * @model
 * @generated
 */
public interface PointInTimeTrigger extends ScalingTrigger {
	/**
	 * Returns the value of the '<em><b>Point In Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The simulation time at which the target group should be adjusted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point In Time</em>' attribute.
	 * @see #setPointInTime(double)
	 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getPointInTimeTrigger_PointInTime()
	 * @model required="true"
	 * @generated
	 */
	double getPointInTime();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.triggers.PointInTimeTrigger#getPointInTime <em>Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point In Time</em>' attribute.
	 * @see #getPointInTime()
	 * @generated
	 */
	void setPointInTime(double value);

} // PointInTimeTrigger
