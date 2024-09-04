/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.palladiosimulator.spd.triggers.stimuli.util.StimuliAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StimuliItemProviderAdapterFactory extends StimuliAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationResponseTimeItemProvider operationResponseTimeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationResponseTimeAdapter() {
		if (operationResponseTimeItemProvider == null) {
			operationResponseTimeItemProvider = new OperationResponseTimeItemProvider(this);
		}

		return operationResponseTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.NumberOfElements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfElementsItemProvider numberOfElementsItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.NumberOfElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberOfElementsAdapter() {
		if (numberOfElementsItemProvider == null) {
			numberOfElementsItemProvider = new NumberOfElementsItemProvider(this);
		}

		return numberOfElementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.CPUUtilization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUUtilizationItemProvider cpuUtilizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.CPUUtilization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCPUUtilizationAdapter() {
		if (cpuUtilizationItemProvider == null) {
			cpuUtilizationItemProvider = new CPUUtilizationItemProvider(this);
		}

		return cpuUtilizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryUtilizationItemProvider memoryUtilizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryUtilizationAdapter() {
		if (memoryUtilizationItemProvider == null) {
			memoryUtilizationItemProvider = new MemoryUtilizationItemProvider(this);
		}

		return memoryUtilizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.SimulationTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationTimeItemProvider simulationTimeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.SimulationTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulationTimeAdapter() {
		if (simulationTimeItemProvider == null) {
			simulationTimeItemProvider = new SimulationTimeItemProvider(this);
		}

		return simulationTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.HDDUtilization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDUtilizationItemProvider hddUtilizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.HDDUtilization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHDDUtilizationAdapter() {
		if (hddUtilizationItemProvider == null) {
			hddUtilizationItemProvider = new HDDUtilizationItemProvider(this);
		}

		return hddUtilizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.TaskCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCountItemProvider taskCountItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.TaskCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskCountAdapter() {
		if (taskCountItemProvider == null) {
			taskCountItemProvider = new TaskCountItemProvider(this);
		}

		return taskCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.QueueLength} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueLengthItemProvider queueLengthItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.QueueLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueueLengthAdapter() {
		if (queueLengthItemProvider == null) {
			queueLengthItemProvider = new QueueLengthItemProvider(this);
		}

		return queueLengthItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkUtilizationItemProvider networkUtilizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetworkUtilizationAdapter() {
		if (networkUtilizationItemProvider == null) {
			networkUtilizationItemProvider = new NetworkUtilizationItemProvider(this);
		}

		return networkUtilizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedStimulusItemProvider aggregatedStimulusItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.spd.triggers.stimuli.AggregatedStimulus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregatedStimulusAdapter() {
		if (aggregatedStimulusItemProvider == null) {
			aggregatedStimulusItemProvider = new AggregatedStimulusItemProvider(this);
		}

		return aggregatedStimulusItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (operationResponseTimeItemProvider != null) {
			operationResponseTimeItemProvider.dispose();
		}
		if (numberOfElementsItemProvider != null) {
			numberOfElementsItemProvider.dispose();
		}
		if (cpuUtilizationItemProvider != null) {
			cpuUtilizationItemProvider.dispose();
		}
		if (memoryUtilizationItemProvider != null) {
			memoryUtilizationItemProvider.dispose();
		}
		if (simulationTimeItemProvider != null) {
			simulationTimeItemProvider.dispose();
		}
		if (hddUtilizationItemProvider != null) {
			hddUtilizationItemProvider.dispose();
		}
		if (taskCountItemProvider != null) {
			taskCountItemProvider.dispose();
		}
		if (queueLengthItemProvider != null) {
			queueLengthItemProvider.dispose();
		}
		if (networkUtilizationItemProvider != null) {
			networkUtilizationItemProvider.dispose();
		}
		if (aggregatedStimulusItemProvider != null) {
			aggregatedStimulusItemProvider.dispose();
		}
	}

}
