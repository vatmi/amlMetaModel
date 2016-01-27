/*******************************************************************************
 * Copyright (c) 2015 Business Informatics Group at TU Wien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Manuel Wimmer and Emanuel Maetzler
 *******************************************************************************/
/**
 */
package CAEX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}</li>
 *   <li>{@link CAEX.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getInterfaceNameMapping()
 * @model extendedMetaData="name='InterfaceNameMapping' kind='elementOnly'"
 * @generated
 */
public interface InterfaceNameMapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface Name</em>' attribute.
	 * @see #setRoleInterfaceName(String)
	 * @see CAEX.CAEXPackage#getInterfaceNameMapping_RoleInterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='RoleInterfaceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRoleInterfaceName();

	/**
	 * Sets the value of the '{@link CAEX.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface Name</em>' attribute.
	 * @see #getRoleInterfaceName()
	 * @generated
	 */
	void setRoleInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface Name</em>' attribute.
	 * @see #setSystemUnitInterfaceName(String)
	 * @see CAEX.CAEXPackage#getInterfaceNameMapping_SystemUnitInterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SystemUnitInterfaceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemUnitInterfaceName();

	/**
	 * Sets the value of the '{@link CAEX.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface Name</em>' attribute.
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 */
	void setSystemUnitInterfaceName(String value);

} // InterfaceNameMapping
