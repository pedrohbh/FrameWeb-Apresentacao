/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestControllerTemplateItemProvider extends FrameworkProfileItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestControllerTemplateItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addClassTemplatePropertyDescriptor(object);
			addClassExtensionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassTemplatePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RestControllerTemplate_classTemplate_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RestControllerTemplate_classTemplate_feature", "_UI_RestControllerTemplate_type"),
						FramewebPackage.Literals.REST_CONTROLLER_TEMPLATE__CLASS_TEMPLATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassExtensionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RestControllerTemplate_classExtension_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RestControllerTemplate_classExtension_feature", "_UI_RestControllerTemplate_type"),
						FramewebPackage.Literals.REST_CONTROLLER_TEMPLATE__CLASS_EXTENSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RestControllerTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RestControllerTemplate"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage()
	{
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((RestControllerTemplate) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RestControllerTemplate_type")
				: getString("_UI_RestControllerTemplate_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(RestControllerTemplate.class))
		{
		case FramewebPackage.REST_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
		case FramewebPackage.REST_CONTROLLER_TEMPLATE__CLASS_EXTENSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
				|| childFeature == UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT
				|| childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
				|| childFeature == UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT
				|| childFeature == UMLPackage.Literals.PROFILE__METACLASS_REFERENCE
				|| childFeature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT
				|| childFeature == UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE
				|| childFeature == UMLPackage.Literals.PACKAGE__NESTED_PACKAGE
				|| childFeature == UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE
				|| childFeature == UMLPackage.Literals.PACKAGE__OWNED_TYPE;

		if (qualify)
		{
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
