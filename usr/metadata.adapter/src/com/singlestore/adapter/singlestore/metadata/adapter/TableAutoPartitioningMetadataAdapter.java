package com.singlestore.adapter.singlestore.metadata.adapter;

import com.informatica.sdk.adapter.metadata.partition.AutoPartitioningMetadataAdapter;
import com.informatica.sdk.adapter.metadata.aso.semantic.iface.ASOOperation;
import com.informatica.sdk.adapter.metadata.common.Status;
import com.informatica.sdk.adapter.metadata.common.StatusEnum;
import com.informatica.sdk.adapter.metadata.partition.ASOPartitioningScheme;
import com.informatica.sdk.adapter.metadata.partition.AutoPartitioningMetadataContext;
import com.informatica.sdk.adapter.metadata.partitionscheme.*;
import com.informatica.sdk.exceptions.SDKException;

public class TableAutoPartitioningMetadataAdapter extends AutoPartitioningMetadataAdapter  {

    /**
     * Initialize the data partition helper.
     * 
     * @param ctx current partition context
     */

    @Override
    public void init(AutoPartitioningMetadataContext ctx) throws SDKException  {
    }



    /**
	 * Return a list of partitioning schemes the adapter can support
     * to read the partitioned data
     */

    @Override
    public ASOPartitioningScheme getReadPartitioningScheme() throws SDKException  {
    	ASOPartitioningScheme readScheme = new ASOPartitioningScheme();
		readScheme.setSchemeID("readPartitioning");
		readScheme.setScheme(new PassthroughPartitioning());
		 
		return readScheme;
    }



    /**
     * Return a list of partitioning schemes the adapter can support
     * to write the partitioned data
     */

    @Override
    public ASOPartitioningScheme getWritePartitioningScheme() throws SDKException  {
    	ASOPartitioningScheme writeScheme = new ASOPartitioningScheme();
		writeScheme.setSchemeID("writeSchemeID");
		writeScheme.setScheme(new PassthroughPartitioning());

		return writeScheme;
    }



    /**
     * Given the runtime partitioning scheme chosen by framework, populate the adapter specific partition information
     * in the ASOOperation's ReadPartitionInfo, WritePartitionInfo
     * @return status
     */

    @Override
    public Status populateReadCapabilityAttributes(ASOOperation asoOperation) throws SDKException  {
    	return new Status(StatusEnum.SUCCESS, null);
    }



    /**
     * Given the runtime partitioning scheme chosen by framework, populate the adapter specific partition information
     * in the ASOOperation's ReadPartitionInfo, WritePartitionInfo
     * @return status
     */

    @Override
    public Status populateWriteCapabilityAttributes(ASOOperation asoOperation) throws SDKException  {
    	return new Status(StatusEnum.SUCCESS, null);
    }
}