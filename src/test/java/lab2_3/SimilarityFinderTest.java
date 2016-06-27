package lab2_3;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.search.SequenceSearcher;
import edu.iis.mto.similarity.Search;
import edu.iis.mto.similarity.SimilarityFinder;

public class SimilarityFinderTest 
{
	private SequenceSearcher searcher;
	private SimilarityFinder finder;
	
	@Before
	public void start()
	{
		searcher = Search.getSequenceSearcher();
		finder = new SimilarityFinder(searcher);
	}
	
	@Test
	public void similarityFinderTest() {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {1,5,6,7,8};
		int[] seq2 = {1,5,6,7,8};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(1, result, 0.0001);
	}
	
	@Test
	public void similarityFinderTestEmptySeq() {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {};
		int[] seq2 = {};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(1, result, 0.0001);
	}
	
	@Test
	public void similarityFinderTestDifferentSeq() {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {1,5,2,90};
		int[] seq2 = {12,3,4};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(0, result, 0.0001);
	}
	
	@Test
	public void similarityFinderTestSimilarSeq() {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {1,5,2,90,4};
		int[] seq2 = {1,3,4,5,2};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(0.66, result, 0.01);
	}
	
	@Test
	public void similarityFinderTestSimilarSeq2() {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {1};
		int[] seq2 = {20,3,4,11,1};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(0.2, result, 0.01);
	}
	
	@Test
	public void similarityFinderTestSimilarSeq3() throws Exception {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {1,22,3};
		int[] seq2 = {20,3,4,11,100,3000};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(0.125, result, 0.01);
		assertThat(Search.check(searcher, searcher.getClass().getMethod("search", int.class, int[].class)), Matchers.is(3));
	}
}
