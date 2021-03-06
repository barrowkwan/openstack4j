package org.openstack4j.openstack.gbp.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.gbp.ExternalPolicyService;
import org.openstack4j.api.gbp.ExternalSegmentService;
import org.openstack4j.api.gbp.GbpService;
import org.openstack4j.api.gbp.GroupService;
import org.openstack4j.api.gbp.L2policyService;
import org.openstack4j.api.gbp.L3policyService;
import org.openstack4j.api.gbp.NatPoolService;
import org.openstack4j.api.gbp.NetworkPolicyService;
import org.openstack4j.api.gbp.PolicyActionService;
import org.openstack4j.api.gbp.PolicyClassifierService;
import org.openstack4j.api.gbp.PolicyRuleService;
import org.openstack4j.api.gbp.PolicyRuleSetService;
import org.openstack4j.api.gbp.PolicyTargetService;
import org.openstack4j.api.gbp.ServiceProfileService;
import org.openstack4j.api.gbp.ServicechainService;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;
/**
 * GBP services
 * 
 * @author vinod borole
 */
public class GbpServiceImpl extends BaseNetworkingServices implements GbpService {

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalPolicyService externalPolicy() {
        return Apis.get(ExternalPolicyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalSegmentService externalSegment() {
        return Apis.get(ExternalSegmentService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupService group() { 
        return Apis.get(GroupService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public L2policyService l2Policy() {
        return Apis.get(L2policyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public L3policyService l3Policy() {
        return Apis.get(L3policyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NatPoolService natPool() {
        return Apis.get(NatPoolService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkPolicyService networkPolicyService() {
        return Apis.get(NetworkPolicyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyActionService policyAction() {
        return Apis.get(PolicyActionService.class);
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public PolicyRuleService policyRule() {
        return Apis.get(PolicyRuleService.class);
    }
   /**
    * {@inheritDoc}
    */
    @Override
    public PolicyRuleSetService policyRuleSet() {
        return Apis.get(PolicyRuleSetService.class);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyTargetService policyTarget() {
        return Apis.get(PolicyTargetService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyClassifierService policyClassifier() {
        return Apis.get(PolicyClassifierService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicechainService servicechain() {
        return Apis.get(ServicechainService.class);
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public ServiceProfileService serviceProfile() {
        return Apis.get(ServiceProfileService.class);
    }

}
