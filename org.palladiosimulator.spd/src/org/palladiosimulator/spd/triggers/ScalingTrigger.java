/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ScalingTrigger encapsulates both what is observed on the modeled system (the monitoring) as well as how such observation lead to a trigger (the analysis part). 
 * For example, a CPUThresholdBasedTrigger (a possible implementation of this class) defines both how CPU is going to be monitored from the TargetGroup as well as that it is a simple threshold based trigger.
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getScalingTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ScalingTrigger extends EObject {
} // ScalingTrigger
