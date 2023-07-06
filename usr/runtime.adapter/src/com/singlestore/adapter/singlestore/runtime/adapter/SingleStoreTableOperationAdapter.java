package com.singlestore.adapter.singlestore.runtime.adapter;

import com.informatica.sdk.adapter.javasdk.dataadapter.DataSourceOperationAdapter;

import com.informatica.sdk.adapter.javasdk.common.EReturnStatus;
import com.informatica.sdk.adapter.javasdk.common.Logger;
import com.informatica.sdk.adapter.javasdk.metadata.DataSourceOperationContext;
import com.informatica.sdk.adapter.javasdk.metadata.MetadataContext;
import com.informatica.sdk.exceptions.SDKException;
import com.informatica.sdk.adapter.javasdk.common.InfaUtils;

public class SingleStoreTableOperationAdapter extends DataSourceOperationAdapter {

	public SingleStoreTableOperationAdapter(InfaUtils infaUtils, Logger logger) {
	}

	/**
	 * This API should return true if adapter supports transaction if adapter
	 * supports transaction commit and rollback APIs should be implemented in
	 * runtimeOperationAdapter class
	 */

	@Override
	public boolean isTransactional() {
		return false;
	}

	/**
	 * This API should be implemented by adapter developer to initialize the DSO
	 * adapter before any partitions are executed
	 *
	 * @param dsoHandle DSO handle This could be used to set any DSO level metadata
	 *                  common to all partitions in the user handle.
	 * @return EReturnStatus
	 */

	@Override
	public int initDataSourceOperation(DataSourceOperationContext dsoHandle, MetadataContext connHandle)
			throws SDKException {
		return EReturnStatus.SUCCESS;
	}

	/**
	 * This API should be implemented by adapter developer to de-initialize the DSO
	 * adapter after all partitions are executed
	 *
	 * @param dsoHandle DSO handle This could be used to set any DSO level metadata
	 *                  common to all partitions in the user handle.
	 * @return EReturnStatus
	 */

	@Override
	public int deinitDataSourceOperation(DataSourceOperationContext dsoHandle, MetadataContext connHandle)
			throws SDKException {
		return EReturnStatus.SUCCESS;
	}
}