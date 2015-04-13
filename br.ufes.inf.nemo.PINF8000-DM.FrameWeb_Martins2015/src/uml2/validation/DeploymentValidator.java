/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.DeployedArtifact;
import uml2.DeploymentSpecification;
import uml2.DeploymentTarget;

/**
 * A sample validator interface for {@link uml2.Deployment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DeploymentValidator {
	boolean validate();

	boolean validateConfiguration(EList<DeploymentSpecification> value);
	boolean validateDeployedArtifact(EList<DeployedArtifact> value);
	boolean validateLocation(DeploymentTarget value);
}