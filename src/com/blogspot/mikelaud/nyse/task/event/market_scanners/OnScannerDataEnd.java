package com.blogspot.mikelaud.nyse.task.event.market_scanners;

import com.blogspot.mikelaud.nyse.connection.ConnectionContext;
import com.blogspot.mikelaud.nyse.task.Task;
import com.blogspot.mikelaud.nyse.task.event.EventTaskEx;
import com.blogspot.mikelaud.nyse.task.event.EventType;

/**
 * This event is called when the snapshot is received
 * and marks the end of one scan.
 */
public class OnScannerDataEnd
	extends EventTaskEx<OnScannerDataEnd.Info>
{
	//------------------------------------------------------------------------
	public static class Info {
	
		/**
		 * The ID of the market data snapshot
		 * request being closed by this parameter.
		 */
		public final int REQ_ID;
		
		public Info(int aReqId) {
			REQ_ID = aReqId;
		}
		
	}
	//------------------------------------------------------------------------

	@Override
	protected Task onEvent() throws Exception {
		return null;
	}

	@Override
	public String toString() {
		return String.format
		(	"%s[%d]"
		,	super.toString()
		,	INFO.REQ_ID
		);
	}
	
	public OnScannerDataEnd(ConnectionContext aContext, Info aInfo) {
		super(aContext, aInfo, EventType.scannerDataEnd);
	}

}