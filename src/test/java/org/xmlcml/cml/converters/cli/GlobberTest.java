package org.xmlcml.cml.converters.cli;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class GlobberTest {

	@Test
	@Ignore
	public void testGlob() throws Exception {
//		Globber globber = new Globber("*.mol", "src/test/resources/examples/mdl");
//		List<File> fileList = globber.walkTree();
//		Assert.assertEquals("paths", 3, fileList.size());
	}

	@Test
	public void testGlob1() throws Exception {
//		Globber globber = new Globber("*.mol", "src/test/resources/examples");
//		List<File> fileList = globber.walkTree();
//		Assert.assertEquals("paths", 5, fileList.size());
	}

	@Test
	public void testGlob2() throws Exception {
//		Globber globber = new Globber("*.mol");
//		List<File> fileList = globber.walkTree();
//		Assert.assertEquals("paths", 10, fileList.size());
	}
	
	@Test
	public void testGlob3() throws Exception {
//		Globber globber = new Globber("*.mol", "src");
//		Path path = new File("src").toPath();
//		List<File> fileList = globber.walkTree();
//		Assert.assertEquals("paths", 5, fileList.size());
	}
	
	@Test
	@Ignore
	public void testGlob4() throws Exception {
//		Globber globber = new Globber("*.mol", "src/test/resources/examples/mdl");
//		List<File> fileList = globber.walkTree();
//		Assert.assertEquals("paths", 3, fileList.size());
	}

	@Test
	public void testStackoverflowGlobber() throws IOException {
//	    final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.cml");
//	    Files.walkFileTree(Paths.get("d:/petermr-workspace/jumbo-converters/jumbo-converters-cli/src/test/resources"), new SimpleFileVisitor<Path>() {
//	        @Override
//	        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//	        	System.out.println("try>> "+file);
//	            if (matcher.matches(file)) {
//	                System.out.println("MATCHES>>"+file);
//	            }
//	            return FileVisitResult.CONTINUE;
//	        }
//
//	        @Override
//	        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
//	            return FileVisitResult.CONTINUE;
//	        }
//	    });
	}
}
