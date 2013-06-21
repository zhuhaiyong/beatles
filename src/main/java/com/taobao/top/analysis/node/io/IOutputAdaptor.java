/**
 * 
 */
package com.taobao.top.analysis.node.io;

import com.taobao.top.analysis.node.job.JobTask;
import com.taobao.top.analysis.node.job.JobTaskResult;


/**
 * 支持输出适配的方式来将结果反馈到输出设备（可以是本地文件，远端的Master，HDFS等等，随意扩展）
 * @author fangweng
 * @Email fangweng@taobao.com
 * 2011-11-24
 *
 */
public interface IOutputAdaptor {

	public void sendResultToOutput(JobTask jobTask,JobTaskResult jobTaskResult);
	
	boolean ignore(String output);
	
}
