/**
 */
package de.unistuttgart.slingshot.spd.triggers.impl;

import de.unistuttgart.slingshot.spd.triggers.CPUUtilizationTrigger;
import de.unistuttgart.slingshot.spd.triggers.TriggersPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPU Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CPUUtilizationTriggerImpl extends ProcessingResourceUtilizationBasedTriggerImpl implements CPUUtilizationTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUUtilizationTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.CPU_UTILIZATION_TRIGGER;
	}

} //CPUUtilizationTriggerImpl
