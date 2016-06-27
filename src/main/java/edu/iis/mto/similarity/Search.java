package edu.iis.mto.similarity;

import java.lang.reflect.Method;

import edu.iis.mto.search.SequenceSearcher;

public class Search 
{
	public static SequenceSearcher getSequenceSearcher() {
 		return new SequenceResult();
 	}
}
