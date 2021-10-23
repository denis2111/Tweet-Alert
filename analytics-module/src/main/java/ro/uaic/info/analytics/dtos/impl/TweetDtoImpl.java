/**
 */
package analytics.dtos.impl;

import analytics.dtos.FeedbackDto;
import analytics.dtos.TweetDto;
import analytics.dtos.Verdict;
import analytics.dtos.dtosPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweet Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link analytics.dtos.impl.TweetDtoImpl#getFeedbackDto <em>Feedback Dto</em>}</li>
 *   <li>{@link analytics.dtos.impl.TweetDtoImpl#getText <em>Text</em>}</li>
 *   <li>{@link analytics.dtos.impl.TweetDtoImpl#getUID <em>UID</em>}</li>
 *   <li>{@link analytics.dtos.impl.TweetDtoImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link analytics.dtos.impl.TweetDtoImpl#getCompressedImage <em>Compressed Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetDtoImpl extends MinimalEObjectImpl.Container implements TweetDto {
	/**
	 * The cached value of the '{@link #getFeedbackDto() <em>Feedback Dto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDto()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackDto> feedbackDto;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected Verdict verdict;

	/**
	 * The default value of the '{@link #getCompressedImage() <em>Compressed Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedImage()
	 * @generated
	 * @ordered
	 */
	protected static final byte COMPRESSED_IMAGE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getCompressedImage() <em>Compressed Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedImage()
	 * @generated
	 * @ordered
	 */
	protected byte compressedImage = COMPRESSED_IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetDtoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return dtosPackage.Literals.TWEET_DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeedbackDto> getFeedbackDto() {
		if (feedbackDto == null) {
			feedbackDto = new EObjectContainmentEList<FeedbackDto>(FeedbackDto.class, this,
					dtosPackage.TWEET_DTO__FEEDBACK_DTO);
		}
		return feedbackDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dtosPackage.TWEET_DTO__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUID() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUID(String newUID) {
		String oldUID = uid;
		uid = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dtosPackage.TWEET_DTO__UID, oldUID, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verdict getVerdict() {
		return verdict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerdict(Verdict newVerdict, NotificationChain msgs) {
		Verdict oldVerdict = verdict;
		verdict = newVerdict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					dtosPackage.TWEET_DTO__VERDICT, oldVerdict, newVerdict);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerdict(Verdict newVerdict) {
		if (newVerdict != verdict) {
			NotificationChain msgs = null;
			if (verdict != null)
				msgs = ((InternalEObject) verdict).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - dtosPackage.TWEET_DTO__VERDICT, null, msgs);
			if (newVerdict != null)
				msgs = ((InternalEObject) newVerdict).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - dtosPackage.TWEET_DTO__VERDICT, null, msgs);
			msgs = basicSetVerdict(newVerdict, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dtosPackage.TWEET_DTO__VERDICT, newVerdict,
					newVerdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCompressedImage() {
		return compressedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressedImage(byte newCompressedImage) {
		byte oldCompressedImage = compressedImage;
		compressedImage = newCompressedImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, dtosPackage.TWEET_DTO__COMPRESSED_IMAGE,
					oldCompressedImage, compressedImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case dtosPackage.TWEET_DTO__FEEDBACK_DTO:
			return ((InternalEList<?>) getFeedbackDto()).basicRemove(otherEnd, msgs);
		case dtosPackage.TWEET_DTO__VERDICT:
			return basicSetVerdict(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case dtosPackage.TWEET_DTO__FEEDBACK_DTO:
			return getFeedbackDto();
		case dtosPackage.TWEET_DTO__TEXT:
			return getText();
		case dtosPackage.TWEET_DTO__UID:
			return getUID();
		case dtosPackage.TWEET_DTO__VERDICT:
			return getVerdict();
		case dtosPackage.TWEET_DTO__COMPRESSED_IMAGE:
			return getCompressedImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case dtosPackage.TWEET_DTO__FEEDBACK_DTO:
			getFeedbackDto().clear();
			getFeedbackDto().addAll((Collection<? extends FeedbackDto>) newValue);
			return;
		case dtosPackage.TWEET_DTO__TEXT:
			setText((String) newValue);
			return;
		case dtosPackage.TWEET_DTO__UID:
			setUID((String) newValue);
			return;
		case dtosPackage.TWEET_DTO__VERDICT:
			setVerdict((Verdict) newValue);
			return;
		case dtosPackage.TWEET_DTO__COMPRESSED_IMAGE:
			setCompressedImage((Byte) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case dtosPackage.TWEET_DTO__FEEDBACK_DTO:
			getFeedbackDto().clear();
			return;
		case dtosPackage.TWEET_DTO__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case dtosPackage.TWEET_DTO__UID:
			setUID(UID_EDEFAULT);
			return;
		case dtosPackage.TWEET_DTO__VERDICT:
			setVerdict((Verdict) null);
			return;
		case dtosPackage.TWEET_DTO__COMPRESSED_IMAGE:
			setCompressedImage(COMPRESSED_IMAGE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case dtosPackage.TWEET_DTO__FEEDBACK_DTO:
			return feedbackDto != null && !feedbackDto.isEmpty();
		case dtosPackage.TWEET_DTO__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case dtosPackage.TWEET_DTO__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case dtosPackage.TWEET_DTO__VERDICT:
			return verdict != null;
		case dtosPackage.TWEET_DTO__COMPRESSED_IMAGE:
			return compressedImage != COMPRESSED_IMAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", UID: ");
		result.append(uid);
		result.append(", compressedImage: ");
		result.append(compressedImage);
		result.append(')');
		return result.toString();
	}

} //TweetDtoImpl
