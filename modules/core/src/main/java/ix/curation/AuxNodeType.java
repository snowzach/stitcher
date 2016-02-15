package ix.curation;

import org.neo4j.graphdb.Label;

/**
 * Auxilary node types
 */
public enum AuxNodeType implements Label {
    SNAPSHOT,
    SINGLETON,
    GROUP,
    SUPERNODE,
    DATA,
    ENTITY,
    DATASOURCE,
    BLACKLIST
}
