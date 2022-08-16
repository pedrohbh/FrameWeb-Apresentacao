/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.Cascade;
import br.ufes.inf.nemo.frameweb.model.frameweb.Collection;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.Fetch;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.Order;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.internal.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DomainAssociationImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DomainAssociationImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DomainAssociationImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DomainAssociationImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class DomainAssociationImpl extends AssociationImpl implements DomainAssociation
{
	/**
	 * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Collection COLLECTION_EDEFAULT = Collection.SET;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected Collection collection = COLLECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected static final Cascade CASCADE_EDEFAULT = Cascade.REMOVE;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected Cascade cascade = CASCADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final Fetch FETCH_EDEFAULT = Fetch.LAZY;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected Fetch fetch = FETCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Order ORDER_EDEFAULT = Order.NATURAL;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAssociationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FramewebPackage.Literals.DOMAIN_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection getCollection()
	{
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(Collection newCollection)
	{
		Collection oldCollection = collection;
		collection = newCollection == null ? COLLECTION_EDEFAULT : newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_ASSOCIATION__COLLECTION,
					oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cascade getCascade()
	{
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade(Cascade newCascade)
	{
		Cascade oldCascade = cascade;
		cascade = newCascade == null ? CASCADE_EDEFAULT : newCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_ASSOCIATION__CASCADE,
					oldCascade, cascade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fetch getFetch()
	{
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFetch(Fetch newFetch)
	{
		Fetch oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_ASSOCIATION__FETCH, oldFetch,
					fetch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order getOrder()
	{
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(Order newOrder)
	{
		Order oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_ASSOCIATION__ORDER, oldOrder,
					order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Property getSourceMember()
	{
		//		Property sourceMember = getMemberEnds().stream().filter(member -> member.getName().equals("Source")).findFirst()
		//				.get();
		Property sourceMember = getMemberEnds().get(0);

		return sourceMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Property getTargetMember()
	{
		//		Property targetMember = getMemberEnds().stream().filter(member -> member.getName().equals("Target")).findFirst()
		//				.get();
		Property targetMember = getMemberEnds().get(1);

		return targetMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getSourceToTargetCardinality()
	{
		Property sourceMember = getSourceMember();
		Property targetMember = getTargetMember();

		if ((sourceMember.getLower() == 1 || sourceMember.getLower() == 0) && sourceMember.getUpper() == 1)
		{
			if (targetMember.getUpper() == -1 || targetMember.getUpper() > 1)
			{
				return "OneToMany";

			} else
			{
				return "OneToOne";
			}

		} else
		{
			if (targetMember.getUpper() == -1 || targetMember.getUpper() > 1)
			{
				return "ManyToMany";
			} else
			{
				return "ManyToOne";
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getTargetToSourceCardinality()
	{
		String relationCardinality = getSourceToTargetCardinality();

		if (relationCardinality == "OneToMany")
		{
			return "ManyToOne";

		} else if (relationCardinality == "ManyToOne")
		{
			return "OneToMany";

		} else
		{
			return relationCardinality;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case FramewebPackage.DOMAIN_ASSOCIATION__COLLECTION:
			return getCollection();
		case FramewebPackage.DOMAIN_ASSOCIATION__CASCADE:
			return getCascade();
		case FramewebPackage.DOMAIN_ASSOCIATION__FETCH:
			return getFetch();
		case FramewebPackage.DOMAIN_ASSOCIATION__ORDER:
			return getOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FramewebPackage.DOMAIN_ASSOCIATION__COLLECTION:
			setCollection((Collection) newValue);
			return;
		case FramewebPackage.DOMAIN_ASSOCIATION__CASCADE:
			setCascade((Cascade) newValue);
			return;
		case FramewebPackage.DOMAIN_ASSOCIATION__FETCH:
			setFetch((Fetch) newValue);
			return;
		case FramewebPackage.DOMAIN_ASSOCIATION__ORDER:
			setOrder((Order) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.DOMAIN_ASSOCIATION__COLLECTION:
			setCollection(COLLECTION_EDEFAULT);
			return;
		case FramewebPackage.DOMAIN_ASSOCIATION__CASCADE:
			setCascade(CASCADE_EDEFAULT);
			return;
		case FramewebPackage.DOMAIN_ASSOCIATION__FETCH:
			setFetch(FETCH_EDEFAULT);
			return;
		case FramewebPackage.DOMAIN_ASSOCIATION__ORDER:
			setOrder(ORDER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.DOMAIN_ASSOCIATION__COLLECTION:
			return collection != COLLECTION_EDEFAULT;
		case FramewebPackage.DOMAIN_ASSOCIATION__CASCADE:
			return cascade != CASCADE_EDEFAULT;
		case FramewebPackage.DOMAIN_ASSOCIATION__FETCH:
			return fetch != FETCH_EDEFAULT;
		case FramewebPackage.DOMAIN_ASSOCIATION__ORDER:
			return order != ORDER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
		case FramewebPackage.DOMAIN_ASSOCIATION___GET_SOURCE_MEMBER:
			return getSourceMember();
		case FramewebPackage.DOMAIN_ASSOCIATION___GET_TARGET_MEMBER:
			return getTargetMember();
		case FramewebPackage.DOMAIN_ASSOCIATION___GET_SOURCE_TO_TARGET_CARDINALITY:
			return getSourceToTargetCardinality();
		case FramewebPackage.DOMAIN_ASSOCIATION___GET_TARGET_TO_SOURCE_CARDINALITY:
			return getTargetToSourceCardinality();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (collection: ");
		result.append(collection);
		result.append(", cascade: ");
		result.append(cascade);
		result.append(", fetch: ");
		result.append(fetch);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //DomainAssociationImpl
