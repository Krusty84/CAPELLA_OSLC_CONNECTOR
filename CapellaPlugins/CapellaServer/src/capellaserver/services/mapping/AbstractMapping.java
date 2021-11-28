package capellaserver.services.mapping;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

import capellaserver.domain.Element;
import capellaserver.domain.Link;

public abstract class AbstractMapping implements IMapping {
	protected Class<?> _source;
	protected Class<?> _target;

	@Override
	public Class<?> getSourceClass() {
		return _source;
	}

	@Override
	public Class<?> getTargetClass() {
		return _target;
	}

	@Override
	public String getSourceClassName() {
		return _source.getSimpleName();
	}

	@Override
	public String getTargetClassName() {
		return _target.getSimpleName();
	}

	protected static URI createURI(String uriString) {
		try {
			return new URI(uriString);
		} catch (URISyntaxException e1) {
			return null;
		}
	}

	protected static void addAllCapellaTypes(Element target, Class<?> capellaElementClass) {
		target.addType(capellaElementClass.getSimpleName());
		capellaElementClass = capellaElementClass.getSuperclass();
		while (capellaElementClass != null) {
			target.addType(capellaElementClass.getSimpleName());
			capellaElementClass = capellaElementClass.getSuperclass();
		}
	}

	protected static void setOwnerIfPresent(EObject source, Element target, String linkBaseUrl) {
		if (source.eContainer() != null && source.eContainer() instanceof CapellaElement) {
			Link ownerLink = new Link(createURI(linkBaseUrl + ((CapellaElement) source.eContainer()).getId()));
			target.setOwner(ownerLink);
		}
	}

}
