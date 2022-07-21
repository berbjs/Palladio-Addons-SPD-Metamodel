/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers.impl;

import de.unistuttgart.slingshot.spd.triggers.RAMUtilizationTrigger;
import de.unistuttgart.slingshot.spd.triggers.TriggersPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAM Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RAMUtilizationTriggerImpl extends ProcessingResourceUtilizationBasedTriggerImpl implements RAMUtilizationTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAMUtilizationTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.RAM_UTILIZATION_TRIGGER;
	}

} //RAMUtilizationTriggerImpl
