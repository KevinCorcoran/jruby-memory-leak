import org.jruby.embed.ScriptingContainer;

public class LeakMemory
{
    public static void main( String[] args )
    {
        String rubyScript =
                "Gem.clear_paths"           + '\n' +
                "begin"                     + '\n' +
                "  require 'foo'"           + '\n' +
                "rescue Exception"          + '\n' +
                "end";

        ScriptingContainer scriptingContainer = new ScriptingContainer();

        System.out.println("\n Running scripts...");
        while (true) {
            scriptingContainer.runScriptlet(rubyScript);
        }
    }
}
