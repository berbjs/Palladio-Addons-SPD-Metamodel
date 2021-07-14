/**
 */
package spd.scalingtrigger.impl;

import org.eclipse.emf.ecore.EClass;

import spd.scalingtrigger.CPUUtilizationTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;

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
		return ScalingtriggerPackage.Literals.CPU_UTILIZATION_TRIGGER;
	}

} //CPUUtilizationTriggerImpl
