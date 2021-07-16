/**
 */
package spd.scalingtrigger.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spd.scalingtrigger.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingtriggerFactoryImpl extends EFactoryImpl implements ScalingtriggerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScalingtriggerFactory init() {
		try {
			ScalingtriggerFactory theScalingtriggerFactory = (ScalingtriggerFactory)EPackage.Registry.INSTANCE.getEFactory(ScalingtriggerPackage.eNS_URI);
			if (theScalingtriggerFactory != null) {
				return theScalingtriggerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScalingtriggerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingtriggerFactoryImpl() {
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
			case ScalingtriggerPackage.CPU_UTILIZATION_TRIGGER: return createCPUUtilizationTrigger();
			case ScalingtriggerPackage.RAM_UTILIZATION_TRIGGER: return createRAMUtilizationTrigger();
			case ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER: return createHDDUtilizationTrigger();
			case ScalingtriggerPackage.POINT_IN_TIME_TRIGGER: return createPointInTimeTrigger();
			case ScalingtriggerPackage.IDLE_TIME_TRIGGER: return createIdleTimeTrigger();
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER: return createTaskCountTrigger();
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER: return createNetworkUtilizationTrigger();
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER: return createResponseTimeTrigger();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScalingtriggerPackage.AGGREGATIONMETHOD:
				return createAGGREGATIONMETHODFromString(eDataType, initialValue);
			case ScalingtriggerPackage.HDDUSAGETYPE:
				return createHDDUSAGETYPEFromString(eDataType, initialValue);
			case ScalingtriggerPackage.NETWORKUSAGETYPE:
				return createNETWORKUSAGETYPEFromString(eDataType, initialValue);
			case ScalingtriggerPackage.THRESHOLDDIRECTION:
				return createTHRESHOLDDIRECTIONFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScalingtriggerPackage.AGGREGATIONMETHOD:
				return convertAGGREGATIONMETHODToString(eDataType, instanceValue);
			case ScalingtriggerPackage.HDDUSAGETYPE:
				return convertHDDUSAGETYPEToString(eDataType, instanceValue);
			case ScalingtriggerPackage.NETWORKUSAGETYPE:
				return convertNETWORKUSAGETYPEToString(eDataType, instanceValue);
			case ScalingtriggerPackage.THRESHOLDDIRECTION:
				return convertTHRESHOLDDIRECTIONToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUUtilizationTrigger createCPUUtilizationTrigger() {
		CPUUtilizationTriggerImpl cpuUtilizationTrigger = new CPUUtilizationTriggerImpl();
		return cpuUtilizationTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMUtilizationTrigger createRAMUtilizationTrigger() {
		RAMUtilizationTriggerImpl ramUtilizationTrigger = new RAMUtilizationTriggerImpl();
		return ramUtilizationTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HDDUtilizationTrigger createHDDUtilizationTrigger() {
		HDDUtilizationTriggerImpl hddUtilizationTrigger = new HDDUtilizationTriggerImpl();
		return hddUtilizationTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointInTimeTrigger createPointInTimeTrigger() {
		PointInTimeTriggerImpl pointInTimeTrigger = new PointInTimeTriggerImpl();
		return pointInTimeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdleTimeTrigger createIdleTimeTrigger() {
		IdleTimeTriggerImpl idleTimeTrigger = new IdleTimeTriggerImpl();
		return idleTimeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCountTrigger createTaskCountTrigger() {
		TaskCountTriggerImpl taskCountTrigger = new TaskCountTriggerImpl();
		return taskCountTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkUtilizationTrigger createNetworkUtilizationTrigger() {
		NetworkUtilizationTriggerImpl networkUtilizationTrigger = new NetworkUtilizationTriggerImpl();
		return networkUtilizationTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseTimeTrigger createResponseTimeTrigger() {
		ResponseTimeTriggerImpl responseTimeTrigger = new ResponseTimeTriggerImpl();
		return responseTimeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGGREGATIONMETHOD createAGGREGATIONMETHODFromString(EDataType eDataType, String initialValue) {
		AGGREGATIONMETHOD result = AGGREGATIONMETHOD.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAGGREGATIONMETHODToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDUSAGETYPE createHDDUSAGETYPEFromString(EDataType eDataType, String initialValue) {
		HDDUSAGETYPE result = HDDUSAGETYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHDDUSAGETYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NETWORKUSAGETYPE createNETWORKUSAGETYPEFromString(EDataType eDataType, String initialValue) {
		NETWORKUSAGETYPE result = NETWORKUSAGETYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNETWORKUSAGETYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THRESHOLDDIRECTION createTHRESHOLDDIRECTIONFromString(EDataType eDataType, String initialValue) {
		THRESHOLDDIRECTION result = THRESHOLDDIRECTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTHRESHOLDDIRECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingtriggerPackage getScalingtriggerPackage() {
		return (ScalingtriggerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScalingtriggerPackage getPackage() {
		return ScalingtriggerPackage.eINSTANCE;
	}

} //ScalingtriggerFactoryImpl
