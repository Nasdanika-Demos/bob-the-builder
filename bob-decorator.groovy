import org.nasdanika.models.app.graph.drawio.RepresentationElementFilter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.drawio.Element;
import org.nasdanika.drawio.ModelElement;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.capability.CapabilityFactory.Loader

// Script arguments for reference
Loader loader = args[0];
ProgressMonitor loaderProgressMonitor = args[1];
Object data = args[2]; // From fragment

new RepresentationElementFilter() {

    @Override
    void filterRepresentationElement(
	ModelElement<?> sourceElement, 
	ModelElement<?> representationElement,
	Map<Element<?>, ProcessorInfo<WidgetFactory,WidgetFactory,Object,WidgetFactory>> registry, ProgressMonitor progressMonitor) {

        if ("Bob".equals(representationElement.getLabel())) {
            representationElement.style("imageBorder", "default");
        }
    }
    
}