/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.triggers.impl;

import de.unistuttgart.slingshot.spd.triggers.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggersFactoryImpl extends EFactoryImpl implements TriggersFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright SQA 2022";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggersFactory init() {
		try {
			TriggersFactory theTriggersFactory = (TriggersFactory)EPackage.Registry.INSTANCE.getEFactory(TriggersPackage.eNS_URI);
			if (theTriggersFactory != null) {
				return theTriggersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TriggersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersFactoryImpl() {
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
			case TriggersPackage.CPU_UTILIZATION_TRIGGER: return createCPUUtilizationTrigger();
			case TriggersPackage.RAM_UTILIZATION_TRIGGER: return createRAMUtilizationTrigger();
			case TriggersPackage.HDD_UTILIZATION_TRIGGER: return createHDDUtilizationTrigger();
			case TriggersPackage.POINT_IN_TIME_TRIGGER: return createPointInTimeTrigger();
			case TriggersPackage.IDLE_TIME_TRIGGER: return createIdleTimeTrigger();
			case TriggersPackage.TASK_COUNT_TRIGGER: return createTaskCountTrigger();
			case TriggersPackage.NETWORK_UTILIZATION_TRIGGER: return createNetworkUtilizationTrigger();
			case TriggersPackage.RESPONSE_TIME_TRIGGER: return createResponseTimeTrigger();
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
			case TriggersPackage.AGGREGATIONMETHOD:
				return createAGGREGATIONMETHODFromString(eDataType, initialValue);
			case TriggersPackage.HDDUSAGETYPE:
				return createHDDUSAGETYPEFromString(eDataType, initialValue);
			case TriggersPackage.NETWORKUSAGETYPE:
				return createNETWORKUSAGETYPEFromString(eDataType, initialValue);
			case TriggersPackage.THRESHOLDDIRECTION:
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
			case TriggersPackage.AGGREGATIONMETHOD:
				return convertAGGREGATIONMETHODToString(eDataType, instanceValue);
			case TriggersPackage.HDDUSAGETYPE:
				return convertHDDUSAGETYPEToString(eDataType, instanceValue);
			case TriggersPackage.NETWORKUSAGETYPE:
				return convertNETWORKUSAGETYPEToString(eDataType, instanceValue);
			case TriggersPackage.THRESHOLDDIRECTION:
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
	public TriggersPackage getTriggersPackage() {
		return (TriggersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TriggersPackage getPackage() {
		return TriggersPackage.eINSTANCE;
	}

} //TriggersFactoryImpl
