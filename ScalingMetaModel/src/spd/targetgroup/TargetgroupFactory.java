/**
 */
package spd.targetgroup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spd.targetgroup.TargetgroupPackage
 * @generated
 */
public interface TargetgroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetgroupFactory eINSTANCE = spd.targetgroup.impl.TargetgroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Group</em>'.
	 * @generated
	 */
	TargetGroup createTargetGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetgroupPackage getTargetgroupPackage();

} //TargetgroupFactory
